package com.chigirh.bc.notice.application.usecase

import mu.KotlinLogging

/**
 * UseCase base class.
 */
abstract class UseCaseBase<I : Input, O : Output> {
    protected fun doUseCase(input: I): O {
        logger.info { "Use case name:${input.getName()} start." }
        val output = useCase(input)
        logger.info { "Use case name:${input.getName()} end." }

        return output
    }

    abstract fun useCase(input: I): O

    companion object {
        private val logger = KotlinLogging.logger {}
    }
}

abstract class Input {
    abstract fun getName(): String
}

abstract class Output
