package com.hand.algorithm.offer;

import java.util.Stack;

/**
 * 翻转单词顺序列：
 * 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上
 * 同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思
 * 例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，
 * 正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 */
public class Solution44 {
    /**
     * 栈
     *
     * @param str
     * @return
     */
    public String ReverseSentence(String str) {
        String trimStr = str.trim();
        if ("".equals(trimStr) && str.length() > 0) return str;
        Stack<String> stack = new Stack<>();
        String[] strings = trimStr.split(" ");
        for (String s : strings) {
            stack.push(s);
        }
        StringBuilder sb = new StringBuilder(stack.pop());
        while (!stack.isEmpty()) {
            sb.append(" ").append(stack.pop());
        }
        return sb.toString();
    }
}
