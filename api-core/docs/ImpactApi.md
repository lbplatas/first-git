# ImpactApi

All URIs are relative to *http://localhost:8080/banking*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSavingsImpact**](ImpactApi.md#getSavingsImpact) | **GET** /impact/balancebased/savings | 
[**postInvestmentImpact**](ImpactApi.md#postInvestmentImpact) | **POST** /impact/balancebased/funds | 


<a name="getSavingsImpact"></a>
# **getSavingsImpact**
> SavingsImpactResponse getSavingsImpact(amount)



Get the impact the customer makes by having &#x60;&#x60;amount&#x60;&#x60; of euros in their savings account

### Example
```java
// Import classes:
//import es.qc.api.client.ApiException;
//import es.qc.api.apicore.ImpactApi;


ImpactApi apiInstance = new ImpactApi();
Double amount = 3.4D; // Double | The amount in the savings account in euros
try {
    SavingsImpactResponse result = apiInstance.getSavingsImpact(amount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImpactApi#getSavingsImpact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **amount** | **Double**| The amount in the savings account in euros |

### Return type

[**SavingsImpactResponse**](SavingsImpactResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postInvestmentImpact"></a>
# **postInvestmentImpact**
> InvestmentImpactResponse postInvestmentImpact(investmentImpactRequest)



Provide list of funds and accompanying shares for which to fetch impact data for the customer

### Example
```java
// Import classes:
//import es.qc.api.client.ApiException;
//import es.qc.api.apicore.ImpactApi;


ImpactApi apiInstance = new ImpactApi();
InvestmentImpactRequest investmentImpactRequest = {"requestedFundsWithShares":[{"fundID":"TPIF","numberOfShares":1},{"fundID":"SAAT","numberOfShares":1},{"fundID":"TFTEF","numberOfShares":1}]}; // InvestmentImpactRequest | 
try {
    InvestmentImpactResponse result = apiInstance.postInvestmentImpact(investmentImpactRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImpactApi#postInvestmentImpact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **investmentImpactRequest** | [**InvestmentImpactRequest**](InvestmentImpactRequest.md)|  |

### Return type

[**InvestmentImpactResponse**](InvestmentImpactResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

