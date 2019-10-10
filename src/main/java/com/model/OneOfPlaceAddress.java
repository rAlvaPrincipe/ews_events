package com.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

/**
* OneOfPlaceAddress
*/
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, defaultImpl = LangString.class)
@JsonSubTypes({ 
	  @Type(value = PostalAddress.class, name = "ews:PostalAddress")
	})
public interface OneOfPlaceAddress {

}
