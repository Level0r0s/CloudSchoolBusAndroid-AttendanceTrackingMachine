package com.guokrspace;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table CARD_ENTITY.
 */
public class CardEntity {

    private Long id;
    private String cardnumber;
    /** Not-null value. */
    private String studentid;

    public CardEntity() {
    }

    public CardEntity(Long id) {
        this.id = id;
    }

    public CardEntity(Long id, String cardnumber, String studentid) {
        this.id = id;
        this.cardnumber = cardnumber;
        this.studentid = studentid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    /** Not-null value. */
    public String getStudentid() {
        return studentid;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

}
