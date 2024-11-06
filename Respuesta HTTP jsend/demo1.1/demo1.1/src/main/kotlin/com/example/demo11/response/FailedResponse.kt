package com.example.demo11.response

import org.apache.logging.log4j.message.Message

class FailedResponse (
    var status: String? = null,
    var data: Any? = null
)