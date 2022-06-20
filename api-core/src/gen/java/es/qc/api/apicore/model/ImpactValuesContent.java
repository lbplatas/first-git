package es.qc.api.apicore.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import es.qc.api.apicore.model.ImpactValuesContentMeasurementIcon;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Wordings of an impact metric
 */

@Schema(name = "ImpactValues_content", description = "Wordings of an impact metric")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-16T14:05:38.997555200+02:00[Europe/Madrid]")
public class ImpactValuesContent   {

  @JsonProperty("measurement")
  private String measurement;

  @JsonProperty("measurementDescription")
  private String measurementDescription;

  @JsonProperty("measurementEquivalence")
  private String measurementEquivalence;

  @JsonProperty("measurementIcon")
  private ImpactValuesContentMeasurementIcon measurementIcon;

  public ImpactValuesContent measurement(String measurement) {
    this.measurement = measurement;
    return this;
  }

  /**
   * A text containing the main value and its unit
   * @return measurement
  */
  @NotNull 
  @Schema(name = "measurement", description = "A text containing the main value and its unit", required = true)
  public String getMeasurement() {
    return measurement;
  }

  public void setMeasurement(String measurement) {
    this.measurement = measurement;
  }

  public ImpactValuesContent measurementDescription(String measurementDescription) {
    this.measurementDescription = measurementDescription;
    return this;
  }

  /**
   * A text containing a description about the main value
   * @return measurementDescription
  */
  @NotNull 
  @Schema(name = "measurementDescription", description = "A text containing a description about the main value", required = true)
  public String getMeasurementDescription() {
    return measurementDescription;
  }

  public void setMeasurementDescription(String measurementDescription) {
    this.measurementDescription = measurementDescription;
  }

  public ImpactValuesContent measurementEquivalence(String measurementEquivalence) {
    this.measurementEquivalence = measurementEquivalence;
    return this;
  }

  /**
   * A text containing everything about the equivalence metric if it exists
   * @return measurementEquivalence
  */
  
  @Schema(name = "measurementEquivalence", description = "A text containing everything about the equivalence metric if it exists", required = false)
  public String getMeasurementEquivalence() {
    return measurementEquivalence;
  }

  public void setMeasurementEquivalence(String measurementEquivalence) {
    this.measurementEquivalence = measurementEquivalence;
  }

  public ImpactValuesContent measurementIcon(ImpactValuesContentMeasurementIcon measurementIcon) {
    this.measurementIcon = measurementIcon;
    return this;
  }

  /**
   * Get measurementIcon
   * @return measurementIcon
  */
  @NotNull @Valid 
  @Schema(name = "measurementIcon", required = true)
  public ImpactValuesContentMeasurementIcon getMeasurementIcon() {
    return measurementIcon;
  }

  public void setMeasurementIcon(ImpactValuesContentMeasurementIcon measurementIcon) {
    this.measurementIcon = measurementIcon;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImpactValuesContent impactValuesContent = (ImpactValuesContent) o;
    return Objects.equals(this.measurement, impactValuesContent.measurement) &&
        Objects.equals(this.measurementDescription, impactValuesContent.measurementDescription) &&
        Objects.equals(this.measurementEquivalence, impactValuesContent.measurementEquivalence) &&
        Objects.equals(this.measurementIcon, impactValuesContent.measurementIcon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(measurement, measurementDescription, measurementEquivalence, measurementIcon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImpactValuesContent {\n");
    sb.append("    measurement: ").append(toIndentedString(measurement)).append("\n");
    sb.append("    measurementDescription: ").append(toIndentedString(measurementDescription)).append("\n");
    sb.append("    measurementEquivalence: ").append(toIndentedString(measurementEquivalence)).append("\n");
    sb.append("    measurementIcon: ").append(toIndentedString(measurementIcon)).append("\n");
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

