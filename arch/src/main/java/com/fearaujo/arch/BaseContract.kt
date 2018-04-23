package com.fearaujo.arch

import android.arch.lifecycle.Lifecycle
import android.os.Bundle

/**
 * Created by felipearaujo on 05/03/18.
 */
interface BaseContract {

    interface View {

    }

    interface Presenter<V: View> {

        var view: V?

        var stateBundle: Bundle

        fun onAttachLifecycle(lifecycle: Lifecycle)

        fun onDetachLifecycle(lifecycle: Lifecycle)

        fun onAttachView(view: V)

        fun onDetachView()

        fun isViewAttached(): Boolean

        fun onPresenterCreated()

        fun onPresenterDestroy()

    }

}