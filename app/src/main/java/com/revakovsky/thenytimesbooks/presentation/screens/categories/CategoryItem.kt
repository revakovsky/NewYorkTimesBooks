package com.revakovsky.thenytimesbooks.presentation.screens.categories

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.revakovsky.thenytimesbooks.R
import com.revakovsky.thenytimesbooks.presentation.models.CategoryUi
import com.revakovsky.thenytimesbooks.presentation.ui.theme.dimens
import com.revakovsky.thenytimesbooks.presentation.widgets.TextRegular
import com.revakovsky.thenytimesbooks.presentation.widgets.TextTitle

@Composable
fun CategoryItem(
    category: CategoryUi,
    onCategoryClick: (categoryName: String) -> Unit,
    modifier: Modifier = Modifier,
) {

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(dimens.medium)
            .clickable { onCategoryClick(category.categoryName) },
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {

        TextTitle(text = category.categoryName)

        Column(
            modifier = Modifier.padding(top = dimens.extraSmall),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {

            TextRegular(
                text = stringResource(R.string.published_date, category.publishedDate),
            )

            Spacer(modifier = Modifier.height(dimens.smallest))

            TextRegular(
                text = stringResource(R.string.updated, category.howOftenIsItUpdated),
            )

        }

    }

}
