package es.qc.api.apicore.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of an error.
 */

@Schema(name = "Error", description = "Details of an error.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-16T14:05:38.997555200+02:00[Europe/Madrid]")
public class Error   {

  @JsonProperty("title")
  private String title;

  @JsonProperty("message")
  private String message;

  /**
   * An error code, that is, a technical code allowing the client-software to adapt its behaviour accordingly.
   */
  public enum CodeEnum {
    AUTH_FAILED("AUTH_FAILED"),
    
    SIGNING_REQUIRED("SIGNING_REQUIRED"),
    
    SIGNING_FAILED("SIGNING_FAILED"),
    
    BIOMETRIC_AUTH_DISABLED("BIOMETRIC_AUTH_DISABLED"),
    
    BLOCKED("BLOCKED"),
    
    BLOCKING_ERROR("BLOCKING_ERROR"),
    
    CLIENT_OUTDATED("CLIENT_OUTDATED"),
    
    GENERAL("GENERAL"),
    
    INVALID_SIGNATURE("INVALID_SIGNATURE"),
    
    MISSING_REQUEST_HEADERS("MISSING_REQUEST_HEADERS"),
    
    SESSION_EXPIRED("SESSION_EXPIRED"),
    
    TEMPORARILY_UNAVAILABLE("TEMPORARILY_UNAVAILABLE"),
    
    REDIRECT("REDIRECT"),
    
    VALIDATION("VALIDATION");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CodeEnum fromValue(String value) {
      for (CodeEnum b : CodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("code")
  private CodeEnum code;

  @JsonProperty("url")
  private URI url;

  public Error title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of an error message is a title that belongs to a localised error message.
   * @return title
  */
  
  @Schema(name = "title", description = "The title of an error message is a title that belongs to a localised error message.", required = false)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

  /**
   * An error message which gives the user a localised description of the error.
   * @return message
  */
  @NotNull 
  @Schema(name = "message", description = "An error message which gives the user a localised description of the error.", required = true)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Error code(CodeEnum code) {
    this.code = code;
    return this;
  }

  /**
   * An error code, that is, a technical code allowing the client-software to adapt its behaviour accordingly.
   * @return code
  */
  
  @Schema(name = "code", description = "An error code, that is, a technical code allowing the client-software to adapt its behaviour accordingly.", required = false)
  public CodeEnum getCode() {
    return code;
  }

  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public Error url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * URL pointing to more info about, or a solution to, this error
   * @return url
  */
  @Valid 
  @Schema(name = "url", description = "URL pointing to more info about, or a solution to, this error", required = false)
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.title, error.title) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.code, error.code) &&
        Objects.equals(this.url, error.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, message, code, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

