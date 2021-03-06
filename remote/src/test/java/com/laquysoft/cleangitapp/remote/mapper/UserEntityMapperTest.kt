package com.laquysoft.cleangitapp.remote.mapper

import com.laquysoft.cleangitapp.remote.test.factory.UserFactory
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import kotlin.test.assertEquals

@RunWith(JUnit4::class)
class UserEntityMapperTest {

    private lateinit var userEntityMapper: UserEntityMapper

    @Before
    fun setUp() {
        userEntityMapper = UserEntityMapper()
    }

    @Test
    fun mapFromRemoteMapsData() {
        val userModel = UserFactory.makeUserModel()
        val userEntity = userEntityMapper.mapFromRemote(userModel)

        assertEquals(userModel.id, userEntity.id)
        assertEquals(userModel.login, userEntity.login)
        assertEquals(userModel.avatarUrl, userEntity.avatarUrl)
    }

}
