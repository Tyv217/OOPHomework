package BinaryTree;
import java.util.NoSuchElementException;
public class FunctionalArray {
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
    private BinaryTreeNode mHead;
    public void insert(int i, int j){
        if(i==1){
            mHead.setValue(j);
        }
        else if(i % 2 == 0){
            mHead = mHead.getLeft();
            insert(i/2, j);
        }
        else{
            mHead = mHead.getRight();
            insert(i/2,j);
        }
    }
    FunctionalArray(int i) {
        for(int x = 0; x < i; x++){
            insert(x,x);
        }
    }
    void set(int index, int value){
        if(mHead == null){
            throw new NoSuchElementException();
        }
        else if(index ==1){
            mHead.setValue(value);
        }
        else if(index % 2 == 0){
            mHead = mHead.getLeft();
            set(index/2, value);
        }
        else{
            mHead = mHead.getRight();
            set(index/2,value);
        }
    }
    int get(int index){
        int x = 0;
        if(mHead == null){
            throw new NoSuchElementException();
        }
        else if(index ==1){
            x = mHead.getValue();
        }
        else if(index % 2 == 0){
            mHead = mHead.getLeft();
            get(index/2);
        }
        else{
            mHead = mHead.getRight();
            get(index/2);
        }
        return x;
    }
}
