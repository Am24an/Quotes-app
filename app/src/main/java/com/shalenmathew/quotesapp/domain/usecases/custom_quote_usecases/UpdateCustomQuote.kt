package com.shalenmathew.quotesapp.domain.usecases.custom_quote_usecases

import com.shalenmathew.quotesapp.domain.model.CustomQuote
import com.shalenmathew.quotesapp.domain.repository.CustomQuoteRepository
import javax.inject.Inject

class UpdateCustomQuote @Inject constructor(
    private val customQuoteRepo: CustomQuoteRepository
) {

    suspend operator fun invoke(quote: CustomQuote){
        customQuoteRepo.updateCustomQuote(quote)
    }

}