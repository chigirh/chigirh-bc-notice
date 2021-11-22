package com.chigirh.bc.notice.repository

import com.chigirh.bc.notice.application.repository.DemoRepository
import com.chigirh.bc.notice.domain.entity.demo.Demo
import org.springframework.stereotype.Repository

/**
 * Demo class.
 */
@Repository
class DemoRepositoryImpl : DemoRepository {

    private val store = HashMap<String, Demo>()

    override fun fetchByKey(key: String): Demo? = store[key]


    override fun create(entity: Demo) {
        store[entity.key] = entity
    }
}