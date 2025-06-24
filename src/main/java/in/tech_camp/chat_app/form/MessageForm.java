package in.tech_camp.chat_app.form;

import in.tech_camp.chat_app.validation.ValidationPriority1;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class MessageForm {
  @NotBlank(message = "Name can't be blank",groups = ValidationPriority1.class)
  private String content;

  private MultipartFile image;
}
