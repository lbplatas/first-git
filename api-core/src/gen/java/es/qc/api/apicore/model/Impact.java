package es.qc.api.apicore.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Single type of impact made by user
 */

@Schema(name = "Impact", description = "Single type of impact made by user")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-16T14:05:38.997555200+02:00[Europe/Madrid]")
public class Impact   {

  /**
   * Type of impact considered (CO2 reduction, waste, etc)
   */
  public enum MetricEnum {
    CO2("CO2"),
    
    WASTE("WASTE"),
    
    WATER("WATER"),
    
    MEALS("MEALS"),
    
    GREEN_ENERGY("GREEN_ENERGY"),
    
    MFI_LOANS("MFI_LOANS"),
    
    MFI_SAVERS("MFI_SAVERS"),
    
    CULTURAL_VISITORS("CULTURAL_VISITORS"),
    
    PERSONS_EDUCATED("PERSONS_EDUCATED"),
    
    SUSTAINABLE_PROPERTY("SUSTAINABLE_PROPERTY");

    private String value;

    MetricEnum(String value) {
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
    public static MetricEnum fromValue(String value) {
      for (MetricEnum b : MetricEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("metric")
  private MetricEnum metric;

  /**
   * The unit in which the impact is measured
   */
  public enum UnitEnum {
    KG("KG"),
    
    LITER("LITER"),
    
    KWH("KWH"),
    
    SQUARE_METRE("SQUARE_METRE"),
    
    QUANTITY("QUANTITY"),
    
    TON("TON"),
    
    KILOTON("KILOTON"),
    
    HECTOLITER("HECTOLITER"),
    
    CUBIC_METRE("CUBIC_METRE"),
    
    MWH("MWH"),
    
    GWH("GWH");

    private String value;

    UnitEnum(String value) {
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
    public static UnitEnum fromValue(String value) {
      for (UnitEnum b : UnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("unit")
  private UnitEnum unit;

  @JsonProperty("value")
  private BigDecimal value;

  /**
   * Equivalent, more real-world, unit in which the impact is measured
   */
  public enum EquivalenceUnitEnum {
    BAGS("BAGS"),
    
    SHOWER_SESSIONS("SHOWER_SESSIONS"),
    
    KM_OF_DRIVING("KM_OF_DRIVING"),
    
    HOUSEHOLDS("HOUSEHOLDS");

    private String value;

    EquivalenceUnitEnum(String value) {
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
    public static EquivalenceUnitEnum fromValue(String value) {
      for (EquivalenceUnitEnum b : EquivalenceUnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("equivalenceUnit")
  private EquivalenceUnitEnum equivalenceUnit;

  @JsonProperty("equivalenceValue")
  private BigDecimal equivalenceValue;

  public Impact metric(MetricEnum metric) {
    this.metric = metric;
    return this;
  }

  /**
   * Type of impact considered (CO2 reduction, waste, etc)
   * @return metric
  */
  
  @Schema(name = "metric", description = "Type of impact considered (CO2 reduction, waste, etc)", required = false)
  public MetricEnum getMetric() {
    return metric;
  }

  public void setMetric(MetricEnum metric) {
    this.metric = metric;
  }

  public Impact unit(UnitEnum unit) {
    this.unit = unit;
    return this;
  }

  /**
   * The unit in which the impact is measured
   * @return unit
  */
  
  @Schema(name = "unit", description = "The unit in which the impact is measured", required = false)
  public UnitEnum getUnit() {
    return unit;
  }

  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }

  public Impact value(BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * The amount of impact made by investing in this fund
   * @return value
  */
  @Valid 
  @Schema(name = "value", description = "The amount of impact made by investing in this fund", required = false)
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public Impact equivalenceUnit(EquivalenceUnitEnum equivalenceUnit) {
    this.equivalenceUnit = equivalenceUnit;
    return this;
  }

  /**
   * Equivalent, more real-world, unit in which the impact is measured
   * @return equivalenceUnit
  */
  
  @Schema(name = "equivalenceUnit", description = "Equivalent, more real-world, unit in which the impact is measured", required = false)
  public EquivalenceUnitEnum getEquivalenceUnit() {
    return equivalenceUnit;
  }

  public void setEquivalenceUnit(EquivalenceUnitEnum equivalenceUnit) {
    this.equivalenceUnit = equivalenceUnit;
  }

  public Impact equivalenceValue(BigDecimal equivalenceValue) {
    this.equivalenceValue = equivalenceValue;
    return this;
  }

  /**
   * The impact made in terms of the equivalenceUnit
   * @return equivalenceValue
  */
  @Valid 
  @Schema(name = "equivalenceValue", description = "The impact made in terms of the equivalenceUnit", required = false)
  public BigDecimal getEquivalenceValue() {
    return equivalenceValue;
  }

  public void setEquivalenceValue(BigDecimal equivalenceValue) {
    this.equivalenceValue = equivalenceValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Impact impact = (Impact) o;
    return Objects.equals(this.metric, impact.metric) &&
        Objects.equals(this.unit, impact.unit) &&
        Objects.equals(this.value, impact.value) &&
        Objects.equals(this.equivalenceUnit, impact.equivalenceUnit) &&
        Objects.equals(this.equivalenceValue, impact.equivalenceValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, unit, value, equivalenceUnit, equivalenceValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Impact {\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    equivalenceUnit: ").append(toIndentedString(equivalenceUnit)).append("\n");
    sb.append("    equivalenceValue: ").append(toIndentedString(equivalenceValue)).append("\n");
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

