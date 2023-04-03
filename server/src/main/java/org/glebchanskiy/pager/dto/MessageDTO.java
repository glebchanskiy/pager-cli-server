package org.glebchanskiy.pager.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageDTO {
    public MessageDTO(Integer id, String text, Integer userId) {
        this.id = id;
        this.text = text;
        this.userId = userId;
    }

    private Integer id;
    private String text;
    private Integer userId;
}
