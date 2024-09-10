package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum FeedDownloadErrorType {

    ERROR("DOWNLOAD_ERROR"),
    
    HTTP_ERROR("DOWNLOAD_HTTP_ERROR")

    private final String value

    FeedDownloadErrorType(String value) {
        this.value = value
    }

    String getValue() {
        value
    }

    @Override
    String toString() {
        String.valueOf(value)
    }
}
