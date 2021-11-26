package org.apache.pdfbox.text;

public class TextToken {
    private Float xPos;
    private Float yPos;
    private Float width;
    private Float height;
    private String text;

    public Float getXPos() {
        return this.xPos;
    }

    public void setXPos(float xPos) {
        this.xPos = xPos;
    }

    public Float getYPos() {
        return this.yPos;
    }

    public void setYPos(float yPos) {
        this.yPos = yPos;
    }

    public Float getWidth() {
        return this.width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public Float getHeight() {
        return this.height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
