package ProgrammingWritten;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by zdmein on 2017/9/18.
 */
public class Trie {
        private final TrieNode ROOT_NODE = new TrieNode('/');

        public boolean contains(String item){
            //去掉首尾空白字符
            item=item.trim();
            int len = item.length();
            if(len < 1){
                return false;
            }
            //从根节点开始查找
            TrieNode node = ROOT_NODE;
            for(int i=0;i<len;i++){
                char character = item.charAt(i);
                TrieNode child = node.getChild(character);
                if(child == null){
                    //未找到匹配节点
                    return false;
                }else{
                    //找到节点，继续往下找
                    node = child;
                }
            }
            if(node.isTerminal()){
                return true;
            }
            return false;
        }
        public void addAll(List<String> items){
            for(String item : items){
                add(item);
            }
        }
        public void add(String item){
            //去掉首尾空白字符
            item=item.trim();
            int len = item.length();
            if(len < 1){
                //长度小于1则忽略
                return;
            }
            //从根节点开始添加
            TrieNode node = ROOT_NODE;
            for(int i=0;i<len;i++){
                char character = item.charAt(i);
                TrieNode child = node.getChildIfNotExistThenCreate(character);
                //改变顶级节点
                node = child;
            }
            //设置终结字符，表示从根节点遍历到此是一个合法的词
            node.setTerminal(true);
        }
        private static class TrieNode{
            private char character;
            private boolean terminal;
            private final Map<Character,TrieNode> children = new ConcurrentHashMap<>();
            public TrieNode(char character){
                this.character = character;
            }
            public boolean isTerminal() {
                return terminal;
            }
            public void setTerminal(boolean terminal) {
                this.terminal = terminal;
            }
            public char getCharacter() {
                return character;
            }
            public void setCharacter(char character) {
                this.character = character;
            }
            public Collection<TrieNode> getChildren() {
                return this.children.values();
            }
            public TrieNode getChild(char character) {
                return this.children.get(character);
            }
            public TrieNode getChildIfNotExistThenCreate(char character) {
                TrieNode child = getChild(character);
                if(child == null){
                    child = new TrieNode(character);
                    addChild(child);
                }
                return child;
            }
            public void addChild(TrieNode child) {
                this.children.put(child.getCharacter(), child);
            }
            public void removeChild(TrieNode child) {
                this.children.remove(child.getCharacter());
            }
        }

        public void show(){
            show(ROOT_NODE,"");
        }
        private void show(TrieNode node, String indent){
            if(node.isTerminal()){
                System.out.println(indent+node.getCharacter()+"(T)");
            }else{
                System.out.println(indent+node.getCharacter());
            }
            for(TrieNode item : node.getChildren()){
                show(item,indent+"\t");
            }
        }
        public static void main(String[] args){
            Trie trie = new Trie();
            trie.add("APDPlat");
            trie.add("APP");
            trie.add("APD");
            trie.add("Nutch");
            trie.add("Lucene");
            trie.add("Hadoop");
            trie.add("Solr");
            trie.add("杨尚川");
            trie.add("杨尚昆");
            trie.add("杨尚喜");
            trie.add("中华人民共和国");
            trie.add("中华人民打太极");
            trie.add("中华");
            trie.add("中心思想");
            trie.add("杨家将");
            trie.show();
        }

}
