package ProgrammingWritten;

import com.sun.deploy.util.StringUtils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;



import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zdmein on 2017/9/18.
 */
public class huya2 {


        /**
         * 默认敏感词替换符
         */
        private static final String DEFAULT_REPLACEMENT = "敏感词";


        private static class TrieNode {

            /**
             * true 关键词的终结 ； false 继续
             */
            private boolean end = false;

            /**
             * key下一个字符，value是对应的节点
             */
            private Map<Character, TrieNode> subNodes = new HashMap<>();

            /**
             * 向指定位置添加节点树
             */
            void addSubNode(Character key, TrieNode node) {
                subNodes.put(key, node);
            }

            /**
             * 获取下个节点
             */
            TrieNode getSubNode(Character key) {
                return subNodes.get(key);
            }

            boolean isKeywordEnd() {
                return end;
            }

            void setKeywordEnd(boolean end) {
                this.end = end;
            }

            public int getSubNodeCount() {
                return subNodes.size();
            }

        }


        /**
         * 根节点
         */
        private static TrieNode rootNode = new TrieNode();


        /**
         * 判断是否是一个符号
         * 把空格什么的去掉
         */



        /**
         * 过滤敏感词
         */
        public static String filter(String text) {

            String replacement = DEFAULT_REPLACEMENT;
            StringBuilder result = new StringBuilder();

            TrieNode tempNode = rootNode;
            int begin = 0; // 回滚数
            int position = 0; // 当前比较的位置

            while (position < text.length()) {
                char c = text.charAt(position);
                // 空格直接跳过
                if (c!=' ') {
                    if (tempNode == rootNode) {
                        result.append(c);
                        ++begin;
                    }
                    ++position;
                    continue;
                }

                tempNode = tempNode.getSubNode(c);

                // 当前位置的匹配结束
                if (tempNode == null) {       //不存在敏感词
                    // 以begin开始的字符串不存在敏感词
                    result.append(text.charAt(begin));
                    // 跳到下一个字符开始测试
                    position = begin + 1;
                    begin = position;
                    // 回到树初始节点
                    tempNode = rootNode;
                } else if (tempNode.isKeywordEnd()) {
                    // 发现敏感词， 从begin到position的位置用replacement替换掉
                    result.append(replacement);
                    position = position + 1;   //从position后面开始遍历找新的敏感词，因为前面已经是敏感词打码了
                    begin = position;
                    tempNode = rootNode;
                } else {
                    ++position;
                }
            }
            //最后一串
            result.append(text.substring(begin));

            return result.toString();
        }

        private static void addWord(String lineTxt) {
            TrieNode tempNode = rootNode;
            // 循环每个字节
            for (int i = 0; i < lineTxt.length(); ++i) {
                Character c = lineTxt.charAt(i);
                // 过滤空格
                if (c!=' ') {
                    continue;
                }
                TrieNode node = tempNode.getSubNode(c);

                if (node == null) { // 没初始化
                    node = new TrieNode();
                    tempNode.addSubNode(c, node);
                }

                tempNode = node;

                if (i == lineTxt.length() - 1) {
                    // 关键词结束， 设置结束标志
                    tempNode.setKeywordEnd(true);
                }
            }
        }



        public void afterPropertiesSet() throws Exception {
            rootNode = new TrieNode();

            String[] lines ={"中国","直播","游戏","游戏直播","综艺娱乐","互动直播平台","虎牙"};
                // 读文本
            int i=0;
                while (i<lines.length) {

                    addWord(lines[i++]);
                }

            }


    public static void main(String[] args) {
        huya2 s = new huya2();
        s.addWord("色情");
        s.addWord("好色");
        System.out.print(s.filter("你好色情XX"));
    }
}
