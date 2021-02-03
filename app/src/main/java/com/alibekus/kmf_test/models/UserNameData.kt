package com.alibekus.kmf_test.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty


@JsonIgnoreProperties(ignoreUnknown = true)
data class UserNameData(
    @JsonProperty("username")
    val username: String?,
    @JsonProperty("firstName")
    val fisrtName: String?,
    @JsonProperty("lastName")
    val lastName: String?,
    @JsonProperty("email")
    val email: String?,
    @JsonProperty("phoneNumber")
    val phoneNumber: String?
)
