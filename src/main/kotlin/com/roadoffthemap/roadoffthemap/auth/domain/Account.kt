package com.roadoffthemap.roadoffthemap.auth.domain

import com.roadoffthemap.roadoffthemap.Util.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "`account`")
class Account(
    name: String,
    email: String,
    password: String
) : BaseEntity() {
    @Column(nullable = false)
    var name: String = name

    @Column(nullable = false)
    var email: String = email

    @Column(nullable = false)
    var password: String = password
}