package com.sungjae.portfolio.providers

import android.content.Context

class ResourceProviderImpl(private val context: Context) : ResourceProvider {

    override fun getString(res: Int) = context.getString(res)
}