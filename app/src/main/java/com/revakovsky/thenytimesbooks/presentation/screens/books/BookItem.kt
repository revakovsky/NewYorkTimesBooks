package com.revakovsky.thenytimesbooks.presentation.screens.books

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.revakovsky.thenytimesbooks.core.WindowType
import com.revakovsky.thenytimesbooks.presentation.models.BookUi
import com.revakovsky.thenytimesbooks.presentation.ui.theme.dimens

@Composable
fun BookItem(
    modifier: Modifier = Modifier,
    book: BookUi,
    windowType: WindowType.Type,
    shouldRefreshImages: Boolean,
    onBookItemClick: (bookTitle: String) -> Unit,
) {

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(dimens.medium),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {

        if (windowType == WindowType.Type.Small) {
            LayoutForSmallScreen(book, shouldRefreshImages, onBookItemClick)
        } else {
            LayoutForMediumAndLargerScreens(book, shouldRefreshImages, onBookItemClick)
        }

    }

}
