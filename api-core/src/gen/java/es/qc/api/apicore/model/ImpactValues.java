package es.qc.api.apicore.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import es.qc.api.apicore.model.FundInfo;
import es.qc.api.apicore.model.Impact;
import es.qc.api.apicore.model.ImpactValuesTiles;
import es.qc.api.apicore.model.Sdgs;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Impact made by user by investing in a single fund or in a list of funds
 */

@Schema(name = "ImpactValues", description = "Impact made by user by investing in a single fund or in a list of funds")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-16T14:05:38.997555200+02:00[Europe/Madrid]")
public class ImpactValues   {

  @JsonProperty("fundInfo")
  private FundInfo fundInfo;

  @JsonProperty("impactMetrics")
  @Valid
  private List<Impact> impactMetrics = null;

  @JsonProperty("sustainableDevelopmentGoals")
  @Valid
  private List<Integer> sustainableDevelopmentGoals = null;

  @JsonProperty("sdgs")
  private Sdgs sdgs;

  @JsonProperty("tiles")
  @Valid
  private List<ImpactValuesTiles> tiles = null;

  public ImpactValues fundInfo(FundInfo fundInfo) {
    this.fundInfo = fundInfo;
    return this;
  }

  /**
   * Get fundInfo
   * @return fundInfo
  */
  @Valid 
  @Schema(name = "fundInfo", required = false)
  public FundInfo getFundInfo() {
    return fundInfo;
  }

  public void setFundInfo(FundInfo fundInfo) {
    this.fundInfo = fundInfo;
  }

  public ImpactValues impactMetrics(List<Impact> impactMetrics) {
    this.impactMetrics = impactMetrics;
    return this;
  }

  public ImpactValues addImpactMetricsItem(Impact impactMetricsItem) {
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

  public ImpactValues sustainableDevelopmentGoals(List<Integer> sustainableDevelopmentGoals) {
    this.sustainableDevelopmentGoals = sustainableDevelopmentGoals;
    return this;
  }

  public ImpactValues addSustainableDevelopmentGoalsItem(Integer sustainableDevelopmentGoalsItem) {
    if (this.sustainableDevelopmentGoals == null) {
      this.sustainableDevelopmentGoals = new ArrayList<>();
    }
    this.sustainableDevelopmentGoals.add(sustainableDevelopmentGoalsItem);
    return this;
  }

  /**
   * List of Sustainable Development Goals this fund contributes to.
   * @return sustainableDevelopmentGoals
  */
  
  @Schema(name = "sustainableDevelopmentGoals", description = "List of Sustainable Development Goals this fund contributes to.", required = false)
  public List<Integer> getSustainableDevelopmentGoals() {
    return sustainableDevelopmentGoals;
  }

  public void setSustainableDevelopmentGoals(List<Integer> sustainableDevelopmentGoals) {
    this.sustainableDevelopmentGoals = sustainableDevelopmentGoals;
  }

  public ImpactValues sdgs(Sdgs sdgs) {
    this.sdgs = sdgs;
    return this;
  }

  /**
   * Get sdgs
   * @return sdgs
  */
  @Valid 
  @Schema(name = "sdgs", required = false)
  public Sdgs getSdgs() {
    return sdgs;
  }

  public void setSdgs(Sdgs sdgs) {
    this.sdgs = sdgs;
  }

  public ImpactValues tiles(List<ImpactValuesTiles> tiles) {
    this.tiles = tiles;
    return this;
  }

  public ImpactValues addTilesItem(ImpactValuesTiles tilesItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImpactValues impactValues = (ImpactValues) o;
    return Objects.equals(this.fundInfo, impactValues.fundInfo) &&
        Objects.equals(this.impactMetrics, impactValues.impactMetrics) &&
        Objects.equals(this.sustainableDevelopmentGoals, impactValues.sustainableDevelopmentGoals) &&
        Objects.equals(this.sdgs, impactValues.sdgs) &&
        Objects.equals(this.tiles, impactValues.tiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundInfo, impactMetrics, sustainableDevelopmentGoals, sdgs, tiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImpactValues {\n");
    sb.append("    fundInfo: ").append(toIndentedString(fundInfo)).append("\n");
    sb.append("    impactMetrics: ").append(toIndentedString(impactMetrics)).append("\n");
    sb.append("    sustainableDevelopmentGoals: ").append(toIndentedString(sustainableDevelopmentGoals)).append("\n");
    sb.append("    sdgs: ").append(toIndentedString(sdgs)).append("\n");
    sb.append("    tiles: ").append(toIndentedString(tiles)).append("\n");
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

