package jp.ac.ccmc.crud_sample.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="名前を入力してください。")
    @Size(max=30, message="名前は30文字以内にしてください。")
    private String name;

    @NotNull(message="年齢を入力してください。")
    @Min(value=0, message="年齢は0以上の数値にしてください。")
    private Integer age;

    @ManyToOne
    private Department department;
}