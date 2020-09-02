package com.omarn.spacechat.ModelClasses

class Users {

    private var uid: String = ""
    private var username: String = ""
    private var profile: String = ""
    private var cover: String = ""
    private var status: String = ""
    private var search: String = ""

    constructor()

    constructor(
        uid: String,
        username: String,
        profile: String,
        cover: String,
        status: String,
        search: String
    ) {
        this.uid = uid
        this.username = username
        this.profile = profile
        this.cover = cover
        this.status = status
        this.search = search
    }

    fun getUID(): String? {
        return uid
    }

    fun setUid(uid: String) {
        this.uid = uid
    }

    fun getUsername(): String? {
        return username
    }

    fun setUsername(username: String) {
        this.username = username
    }

    fun getProfile(): String {
        return profile
    }

    fun setProfile(profile: String) {
        this.profile = profile
    }

    fun getCover(): String? {
        return cover
    }

    fun setCover(cover: String) {
        this.cover = cover
    }

    fun getStatus(): String? {
        return status
    }

    fun setStatus(status: String) {
        this.status = status
    }

    fun getSearch(): String? {
        return search
    }

    fun setSearch(search: String) {
        this.search = search
    }

}