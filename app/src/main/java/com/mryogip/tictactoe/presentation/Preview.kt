package com.mryogip.tictactoe.presentation

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mryogip.tictactoe.data.GameState

@Preview(showBackground = true)
@Composable
fun TicTacToeFieldPreview() {
    TicTacToeField(
        onTapInField = { _, _ -> },
        modifier = Modifier.size(300.dp),
        state = GameState(
            field = arrayOf(
                arrayOf('X', null, null),
                arrayOf(null, 'O', null),
                arrayOf('X', null, null),
            )
        )
    )
}