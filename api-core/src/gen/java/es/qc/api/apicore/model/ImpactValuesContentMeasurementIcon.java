package es.qc.api.apicore.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A link to the icon for the metric on the assetserver for each available image type
 */

@Schema(name = "ImpactValues_content_measurementIcon", description = "A link to the icon for the metric on the assetserver for each available image type")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-16T14:05:38.997555200+02:00[Europe/Madrid]")
public class ImpactValuesContentMeasurementIcon   {

  @JsonProperty("pdf")
  private String pdf;

  @JsonProperty("png")
  private String png;

  @JsonProperty("svg")
  private String svg;

  public ImpactValuesContentMeasurementIcon pdf(String pdf) {
    this.pdf = pdf;
    return this;
  }

  /**
   * a link to the pdf icon for the metric
   * @return pdf
  */
  
  @Schema(name = "pdf", description = "a link to the pdf icon for the metric", required = false)
  public String getPdf() {
    return pdf;
  }

  public void setPdf(String pdf) {
    this.pdf = pdf;
  }

  public ImpactValuesContentMeasurementIcon png(String png) {
    this.png = png;
    return this;
  }

  /**
   * a link to the png icon for the metric
   * @return png
  */
  
  @Schema(name = "png", description = "a link to the png icon for the metric", required = false)
  public String getPng() {
    return png;
  }

  public void setPng(String png) {
    this.png = png;
  }

  public ImpactValuesContentMeasurementIcon svg(String svg) {
    this.svg = svg;
    return this;
  }

  /**
   * a link to the svg icon for the metric
   * @return svg
  */
  
  @Schema(name = "svg", description = "a link to the svg icon for the metric", required = false)
  public String getSvg() {
    return svg;
  }

  public void setSvg(String svg) {
    this.svg = svg;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImpactValuesContentMeasurementIcon impactValuesContentMeasurementIcon = (ImpactValuesContentMeasurementIcon) o;
    return Objects.equals(this.pdf, impactValuesContentMeasurementIcon.pdf) &&
        Objects.equals(this.png, impactValuesContentMeasurementIcon.png) &&
        Objects.equals(this.svg, impactValuesContentMeasurementIcon.svg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pdf, png, svg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImpactValuesContentMeasurementIcon {\n");
    sb.append("    pdf: ").append(toIndentedString(pdf)).append("\n");
    sb.append("    png: ").append(toIndentedString(png)).append("\n");
    sb.append("    svg: ").append(toIndentedString(svg)).append("\n");
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

