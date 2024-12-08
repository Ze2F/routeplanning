package few.route_planning

import android.net.Uri
import android.util.Log
import android.webkit.WebResourceRequest
import android.webkit.WebResourceResponse
import android.webkit.WebView
import android.webkit.WebViewClient

class WebViewClient : WebViewClient() {
    override fun shouldInterceptRequest(view: WebView?, request: WebResourceRequest?): WebResourceResponse? {
        request?.let {
            Log.d("WebViewRequest", "URL: ${it.url}")
            Log.d("WebViewRequest", "Method: ${it.method}")
            Log.d("WebViewRequest", "Headers: ${it.requestHeaders}")
        }
        return super.shouldInterceptRequest(view, request)
    }

}
