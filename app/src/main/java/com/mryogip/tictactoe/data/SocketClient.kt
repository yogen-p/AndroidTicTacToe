package com.mryogip.tictactoe.data

import kotlinx.coroutines.flow.Flow

interface SocketClient {
    fun getGameStateStream(): Flow<GameState>
    suspend fun sendAction(action: MakeTurn)
    suspend fun close()
}