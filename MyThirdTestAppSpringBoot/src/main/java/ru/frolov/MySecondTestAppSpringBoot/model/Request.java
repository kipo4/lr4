package ru.frolov.MySecondTestAppSpringBoot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    @NotBlank(message = "Поле uid не заполнено")
    private String uid;

    @NotBlank(message = "Поле operationUid не заполнено")
    private String operationUid;


    private Systems systemName;

    @NotBlank(message = "Поле systemTime не заполнено")
    private String systemTime;

    private String source;

    @Min(value = 1, message = "Значение communicationId не должно быть меньше 1")
    @Max(value = 100000, message = "Значение communicationId не должно быть больше 100000")
    private int communicationId;

    private int templateId;
    private int productCode;
    private int smsCode;

    @Override
    public String toString() {
        return "{" +
                "uid='" + uid + '\'' +
                ", operationUid='" + operationUid + '\'' +
                ", systemName='" + systemName + '\'' +
                ", systemTime='" + systemTime + '\'' +
                ", source='" + source + '\'' +
                ", communicationId=" + communicationId +
                ", templateId=" + templateId +
                ", productCode=" + productCode +
                ", smsCode=" + smsCode +
                '}';
    }
}
