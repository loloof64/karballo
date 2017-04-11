package karballo.search

import karballo.Config

class SearchEngineThreaded(config: Config) : SearchEngine(config) {


    /**
     * Threaded version
     */
    override fun go(searchParameters: SearchParameters) {
            super.go(searchParameters)
    }

    /**
     * Stops thinking
     */
    fun stopAwait() {
        synchronized(startStopSearchLock) {
            super.stop()
        }
    }

    override fun sleep(time: Long) {

    }
}