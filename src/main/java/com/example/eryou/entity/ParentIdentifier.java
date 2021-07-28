package com.example.eryou.entity;

public class ParentIdentifier {
    // 家长的主键
    private Integer parentId;

    // 家长的身份证号
    private Integer cardId;

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    @Override
    public String toString() {
        return "ParentIdentifier{" +
                "parentId=" + parentId +
                ", cardId=" + cardId +
                '}';
    }
}
