package com.ghostapps.placapp.databinding;
import com.ghostapps.placapp.R;
import com.ghostapps.placapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityPreGameBindingImpl extends ActivityPreGameBinding implements com.ghostapps.placapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.preGameToolbar, 4);
        sViewsWithIds.put(R.id.preGameGuideline, 5);
        sViewsWithIds.put(R.id.preGameHomeTeamLabel, 6);
        sViewsWithIds.put(R.id.preGameAwayTeamLabel, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener preGameAwayTeamInputandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.awayTeamName
            //         is viewModel.setAwayTeamName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(preGameAwayTeamInput);
            // localize variables for thread safety
            // viewModel.awayTeamName
            java.lang.String viewModelAwayTeamName = null;
            // viewModel
            com.ghostapps.placapp.viewModel.preGame.PreGameViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setAwayTeamName(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener preGameHomeTeamInputandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.homeTeamName
            //         is viewModel.setHomeTeamName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(preGameHomeTeamInput);
            // localize variables for thread safety
            // viewModel.homeTeamName
            java.lang.String viewModelHomeTeamName = null;
            // viewModel
            com.ghostapps.placapp.viewModel.preGame.PreGameViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setHomeTeamName(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityPreGameBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityPreGameBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.EditText) bindings[2]
            , (android.widget.TextView) bindings[7]
            , (androidx.constraintlayout.widget.Guideline) bindings[5]
            , (android.widget.EditText) bindings[1]
            , (android.widget.TextView) bindings[6]
            , (com.google.android.material.button.MaterialButton) bindings[3]
            , (com.google.android.material.appbar.MaterialToolbar) bindings[4]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.preGameAwayTeamInput.setTag(null);
        this.preGameHomeTeamInput.setTag(null);
        this.preGameStartGameButton.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.ghostapps.placapp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.ghostapps.placapp.viewModel.preGame.PreGameViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.ghostapps.placapp.viewModel.preGame.PreGameViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewModelAwayTeamName = null;
        java.lang.String viewModelHomeTeamName = null;
        com.ghostapps.placapp.viewModel.preGame.PreGameViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.awayTeamName
                    viewModelAwayTeamName = viewModel.getAwayTeamName();
                    // read viewModel.homeTeamName
                    viewModelHomeTeamName = viewModel.getHomeTeamName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.preGameAwayTeamInput, viewModelAwayTeamName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.preGameHomeTeamInput, viewModelHomeTeamName);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.preGameAwayTeamInput, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, preGameAwayTeamInputandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.preGameHomeTeamInput, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, preGameHomeTeamInputandroidTextAttrChanged);
            this.preGameStartGameButton.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.ghostapps.placapp.viewModel.preGame.PreGameViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onNewGamePressed();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}