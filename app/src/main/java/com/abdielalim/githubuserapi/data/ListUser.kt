package com.abdielalim.githubuserapi.data

import com.google.gson.annotations.SerializedName

class ListUser (
    @SerializedName("incomplete_results")
    val incompleteResults: Boolean,
    @SerializedName("items")
    val items: List<User>,
    @SerializedName("total_count")
    val totalCount: Int

    )