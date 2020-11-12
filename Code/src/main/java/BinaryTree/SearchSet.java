package BinaryTree;
import com.sun.source.util.SourcePositions;

import java.util.Scanner;
public class SearchSet {
    private static class BinaryTreeNode {
        private int mValue;
        private BinaryTreeNode mLeft;
        private BinaryTreeNode mRight;

        public BinaryTreeNode(int mValue) {
            this.mValue = mValue;
            mLeft = null;
            mRight = null;
        }
        public int getValue() {
            return mValue;
        }
        public void setValue(int mValue) {
            this.mValue = mValue;
        }
        public BinaryTreeNode getLeft() {
            return mLeft;
        }
        public BinaryTreeNode getRight() {
            return mRight;
        }
        public void setRight(BinaryTreeNode mRight) {
            this.mRight = mRight;
        }
        public void setLeft(BinaryTreeNode mLeft) {
            this.mLeft = mLeft;
        }
    }
    private int mElements = 0;
    private BinaryTreeNode mHead;

    SearchSet() {
        this.mHead = null;
    }
    public void insert(int i) {
        if (mHead == null) {
            mHead = new BinaryTreeNode(i);
            mElements++;
        } else if (i > mHead.getValue()) {
            if (mHead.getRight() == null) {
                BinaryTreeNode temp = new BinaryTreeNode(i);
                mHead.setRight(temp);
                mElements++;
            } else {
                mHead = mHead.getRight();
                insert(i);
            }
        } else if (i < mHead.getValue()) {
            if (mHead.getLeft() == null) {
                BinaryTreeNode temp = new BinaryTreeNode(i);
                mHead.setLeft(temp);
                mElements++;
            } else {
                mHead = mHead.getLeft();
                insert(i);
            }
        }
    }
    public int getNumbersElement() {
        return mElements;
    }
    public boolean contains(int i) {
        boolean boo = false;
        if (mHead == null) {
            boo = false;
        }
        int j = mHead.getValue();
        if (i == j) {
            boo = true;
        } else if (i > j) {
            mHead = mHead.getRight();
            contains(i);
        } else {
            mHead = mHead.getLeft();
            contains(i);
        }
        return boo;
    }
    public static void main(String[] args) {
        SearchSet searchset = new SearchSet();
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Enter numbers to insert into the binary tree, x to advance to next stage of checking if a number is in");
            String inputString = input.nextLine();
            if(inputString.equals("x")){
                break;
            }
            else{
                searchset.insert(Integer.parseInt(inputString));
            }
        }
        System.out.println("Enter number to search for");
        int inputNumber = Integer.parseInt(input.nextLine());
        if(searchset.contains(inputNumber)){
            System.out.printf("The number %d is in the set", inputNumber);
        }
        else {
            System.out.printf("The number %d is not in the set", inputNumber);
        }
    }
}
