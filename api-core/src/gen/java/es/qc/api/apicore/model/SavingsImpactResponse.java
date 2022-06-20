package es.qc.api.apicore.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import es.qc.api.apicore.model.Impact;
import es.qc.api.apicore.model.ImpactValuesTiles;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Impact made by user by having money in their savings account
 */

@Schema(name = "SavingsImpactResponse", description = "Impact made by user by having money in their savings account")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-16T14:05:38.997555200+02:00[Europe/Madrid]")
public class SavingsImpactResponse   {

  @JsonProperty("impactMetrics")
  @Valid
  private List<Impact> impactMetrics = null;

  @JsonProperty("tiles")
  @Valid
  private List<ImpactValuesTiles> tiles = null;

  @JsonProperty("dataSource")
  private String dataSource;

  public SavingsImpactResponse impactMetrics(List<Impact> impactMetrics) {
    this.impactMetrics = impactMetrics;
    return this;
  }

  public SavingsImpactResponse addImpactMetricsItem(Impact impactMetricsItem) {
    if (this.impactMetrics == null) {
      this.impactMetrics = new ArrayList<>();
    }
    this.impactMetrics.add(impactMetricsItem);
    return this;
  }

  /**
   * Calculated impact in different areas
   * @return impactMetrics
  */
  @Valid 
  @Schema(name = "impactMetrics", description = "Calculated impact in different areas", required = false)
  public List<Impact> getImpactMetrics() {
    return impactMetrics;
  }

  public void setImpactMetrics(List<Impact> impactMetrics) {
    this.impactMetrics = impactMetrics;
  }

  public SavingsImpactResponse tiles(List<ImpactValuesTiles> tiles) {
    this.tiles = tiles;
    return this;
  }

  public SavingsImpactResponse addTilesItem(ImpactValuesTiles tilesItem) {
    if (this.tiles == null) {
      this.tiles = new ArrayList<>();
    }
    this.tiles.add(tilesItem);
    return this;
  }

  /**
   * List of tiles, containing wording for either metrics, extra explanation, or error messages
   * @return tiles
  */
  @Valid 
  @Schema(name = "tiles", description = "List of tiles, containing wording for either metrics, extra explanation, or error messages", required = false)
  public List<ImpactValuesTiles> getTiles() {
    return tiles;
  }

  public void setTiles(List<ImpactValuesTiles> tiles) {
    this.tiles = tiles;
  }

  public SavingsImpactResponse dataSource(String dataSource) {
    this.dataSource = dataSource;
    return this;
  }

  /**
   * Describes the data source used to obtain this data
   * @return dataSource
  */
  
  @Schema(name = "dataSource", description = "Describes the data source used to obtain this data", required = false)
  public String getDataSource() {
    return dataSource;
  }

  public void setDataSource(String dataSource) {
    this.dataSource = dataSource;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavingsImpactResponse savingsImpactResponse = (SavingsImpactResponse) o;
    return Objects.equals(this.impactMetrics, savingsImpactResponse.impactMetrics) &&
        Objects.equals(this.tiles, savingsImpactResponse.tiles) &&
        Objects.equals(this.dataSource, savingsImpactResponse.dataSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impactMetrics, tiles, dataSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavingsImpactResponse {\n");
    sb.append("    impactMetrics: ").append(toIndentedString(impactMetrics)).append("\n");
    sb.append("    tiles: ").append(toIndentedString(tiles)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
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

