package com.example.apisample.model

data class ApiModel(
    val error: Error,
    val eventData: EventData,
    val statusCode: Int
) {
    data class Error(
        val errorCode: Int =0,
        val errorTitle: String="defaultString",
        val userMessage: String="defaultString"
    )

    data class EventData(
//        val body: Any,
//        val headers: Headers,
//        val httpMethod: String,
        val isBase64Encoded: Boolean,
       // val multiValueHeaders:MultiValueHeaders,
//        val multiValueQueryStringParameters: Any,
//        val path: String,
//        val pathParameters: PathParameters,
//        val queryStringParameters: Any,
//        val requestContext: RequestContext,
//        val resource: String,
//        val stageVariables: Any
    ) {
        data class Headers(
            val Accept: String,
//            val Accept-Encoding: String,
//            val Cache-Control: String,
//            val CloudFront-Forwarded-Proto: String,
//            val CloudFront-Is-Desktop-Viewer: String,
//            val CloudFront-Is-Mobile-Viewer: String,
//            val CloudFront-Is-SmartTV-Viewer: String,
//            val CloudFront-Is-Tablet-Viewer: String,
//            val CloudFront-Viewer-Country: String,
//            val Host: String,
//            val Postman-Token: String,
//            val User-Agent: String,
//            val Via: String,
//            val X-Amz-Cf-Id: String,
//            val X-Amzn-Trace-Id: String,
//            val X-Forwarded-For: String,
//            val X-Forwarded-Port: String,
//            val X-Forwarded,
//            val Proto: String,
        )

//        data class MultiValueHeaders(
//            val Accept: List<String>,
//            val Accept-Encoding: List<String>,
//            val Cache-Control: List<String>,
//            val CloudFront-Forwarded-Proto: List<String>,
//            val CloudFront-Is-Desktop-Viewer: List<String>,
//            val CloudFront-Is-Mobile-Viewer: List<String>,
//            val CloudFront-Is-SmartTV-Viewer: List<String>,
//            val CloudFront-Is-Tablet-Viewer: List<String>,
//            val CloudFront-Viewer-Country: List<String>,
//            val Host: List<String>,
//            val Postman-Token: List<String>,
//            val User-Agent: List<String>,
//            val Via: List<String>,
//            val X-Amz-Cf-Id: List<String>,
//            val X-Amzn-Trace-Id: List<String>,
//            val X-Forwarded-For: List<String>,
//            val X-Forwarded-Port: List<String>,
//            val X-Forwarded-Proto: List<String>
//        )

        data class PathParameters(
            val table: String
        )

        data class RequestContext(
            val accountId: String,
            val apiId: String,
            val domainName: String,
            val domainPrefix: String,
            val extendedRequestId: String,
            val httpMethod: String,
            val identity: Identity,
            val path: String,
            val protocol: String,
            val requestId: String,
            val requestTime: String,
            val requestTimeEpoch: Long,
            val resourceId: String,
            val resourcePath: String,
            val stage: String
        ) {
            data class Identity(
                val accessKey: Any,
                val accountId: Any,
                val caller: Any,
                val cognitoAuthenticationProvider: Any,
                val cognitoAuthenticationType: Any,
                val cognitoIdentityId: Any,
                val cognitoIdentityPoolId: Any,
                val principalOrgId: Any,
                val sourceIp: String,
                val user: Any,
                val userAgent: String,
                val userArn: Any
            )
        }
    }
}