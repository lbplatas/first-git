package es.qc.api.apicore.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import es.qc.api.apicore.model.ImpactValuesContent;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An object containing information for a tile relating to investments impact in the app
 */

@Schema(name = "ImpactValues_tiles", description = "An object containing information for a tile relating to investments impact in the app")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-16T14:05:38.997555200+02:00[Europe/Madrid]")
public class ImpactValuesTiles   {

  /**
   * An ID identifying the template
   */
  public enum TemplateIDEnum {
    METRIC_WORDING_WITHOUT_EQUIVALENCE("METRIC_WORDING_WITHOUT_EQUIVALENCE"),
    
    METRIC_WORDING_WITH_EQUIVALENCE("METRIC_WORDING_WITH_EQUIVALENCE"),
    
    EXPLANATION("EXPLANATION"),
    
    INSUFFICIENT_SHARES("INSUFFICIENT_SHARES"),
    
    SAAT("SAAT"),
    
    ERROR("ERROR");

    private String value;

    TemplateIDEnum(String value) {
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
    public static TemplateIDEnum fromValue(String value) {
      for (TemplateIDEnum b : TemplateIDEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("templateID")
  private TemplateIDEnum templateID;

  @JsonProperty("content")
  private ImpactValuesContent content;

  public ImpactValuesTiles templateID(TemplateIDEnum templateID) {
    this.templateID = templateID;
    return this;
  }

  /**
   * An ID identifying the template
   * @return templateID
  */
  @NotNull 
  @Schema(name = "templateID", description = "An ID identifying the template", required = true)
  public TemplateIDEnum getTemplateID() {
    return templateID;
  }

  public void setTemplateID(TemplateIDEnum templateID) {
    this.templateID = templateID;
  }

  public ImpactValuesTiles content(ImpactValuesContent content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  */
  @NotNull @Valid 
  @Schema(name = "content", required = true)
  public ImpactValuesContent getContent() {
    return content;
  }

  public void setContent(ImpactValuesContent content) {
    this.content = content;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImpactValuesTiles impactValuesTiles = (ImpactValuesTiles) o;
    return Objects.equals(this.templateID, impactValuesTiles.templateID) &&
        Objects.equals(this.content, impactValuesTiles.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateID, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImpactValuesTiles {\n");
    sb.append("    templateID: ").append(toIndentedString(templateID)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

