package extendstest;
// 묵시적(implicit) / 명시적(explicit)

// Implicit super constructor Tv2() is undefined 
// for default constructor. Must define an explicit constructor

public class CaptionTv2 extends Tv2 {

    // public CaptionTv2() { // 없어도 기본적으로 있음.
    // super(); // 부모의 default 생성자 호출.
    // }

    public CaptionTv2(String color, int channel, boolean power, boolean caption) {
        super(color, channel, power);
        this.caption = caption;
    }

    private boolean caption;

    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }

    public boolean isCaption() {
        return caption;
    }

    public void setCaption(boolean caption) {
        this.caption = caption;
    }

}
