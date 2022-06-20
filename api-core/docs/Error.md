
# Error

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **String** | The title of an error message is a title that belongs to a localised error message. |  [optional]
**message** | **String** | An error message which gives the user a localised description of the error. | 
**code** | [**CodeEnum**](#CodeEnum) | An error code, that is, a technical code allowing the client-software to adapt its behaviour accordingly. |  [optional]
**url** | **String** | URL pointing to more info about, or a solution to, this error |  [optional]


<a name="CodeEnum"></a>
## Enum: CodeEnum
Name | Value
---- | -----
AUTH_FAILED | &quot;AUTH_FAILED&quot;
SIGNING_REQUIRED | &quot;SIGNING_REQUIRED&quot;
SIGNING_FAILED | &quot;SIGNING_FAILED&quot;
BIOMETRIC_AUTH_DISABLED | &quot;BIOMETRIC_AUTH_DISABLED&quot;
BLOCKED | &quot;BLOCKED&quot;
BLOCKING_ERROR | &quot;BLOCKING_ERROR&quot;
CLIENT_OUTDATED | &quot;CLIENT_OUTDATED&quot;
GENERAL | &quot;GENERAL&quot;
INVALID_SIGNATURE | &quot;INVALID_SIGNATURE&quot;
MISSING_REQUEST_HEADERS | &quot;MISSING_REQUEST_HEADERS&quot;
SESSION_EXPIRED | &quot;SESSION_EXPIRED&quot;
TEMPORARILY_UNAVAILABLE | &quot;TEMPORARILY_UNAVAILABLE&quot;
REDIRECT | &quot;REDIRECT&quot;
VALIDATION | &quot;VALIDATION&quot;



