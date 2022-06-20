
# Impact

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metric** | [**MetricEnum**](#MetricEnum) | Type of impact considered (CO2 reduction, waste, etc) |  [optional]
**unit** | [**UnitEnum**](#UnitEnum) | The unit in which the impact is measured |  [optional]
**value** | [**BigDecimal**](BigDecimal.md) | The amount of impact made by investing in this fund |  [optional]
**equivalenceUnit** | [**EquivalenceUnitEnum**](#EquivalenceUnitEnum) | Equivalent, more real-world, unit in which the impact is measured |  [optional]
**equivalenceValue** | [**BigDecimal**](BigDecimal.md) | The impact made in terms of the equivalenceUnit |  [optional]


<a name="MetricEnum"></a>
## Enum: MetricEnum
Name | Value
---- | -----
CO2 | &quot;CO2&quot;
WASTE | &quot;WASTE&quot;
WATER | &quot;WATER&quot;
MEALS | &quot;MEALS&quot;
GREEN_ENERGY | &quot;GREEN_ENERGY&quot;
MFI_LOANS | &quot;MFI_LOANS&quot;
MFI_SAVERS | &quot;MFI_SAVERS&quot;
CULTURAL_VISITORS | &quot;CULTURAL_VISITORS&quot;
PERSONS_EDUCATED | &quot;PERSONS_EDUCATED&quot;
SUSTAINABLE_PROPERTY | &quot;SUSTAINABLE_PROPERTY&quot;


<a name="UnitEnum"></a>
## Enum: UnitEnum
Name | Value
---- | -----
KG | &quot;KG&quot;
LITER | &quot;LITER&quot;
KWH | &quot;KWH&quot;
SQUARE_METRE | &quot;SQUARE_METRE&quot;
QUANTITY | &quot;QUANTITY&quot;
TON | &quot;TON&quot;
KILOTON | &quot;KILOTON&quot;
HECTOLITER | &quot;HECTOLITER&quot;
CUBIC_METRE | &quot;CUBIC_METRE&quot;
MWH | &quot;MWH&quot;
GWH | &quot;GWH&quot;


<a name="EquivalenceUnitEnum"></a>
## Enum: EquivalenceUnitEnum
Name | Value
---- | -----
BAGS | &quot;BAGS&quot;
SHOWER_SESSIONS | &quot;SHOWER_SESSIONS&quot;
KM_OF_DRIVING | &quot;KM_OF_DRIVING&quot;
HOUSEHOLDS | &quot;HOUSEHOLDS&quot;



