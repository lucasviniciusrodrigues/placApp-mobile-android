package com.ghostapps.placapp.databinding;
import com.ghostapps.placapp.R;
import com.ghostapps.placapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityScoreGameBindingImpl extends ActivityScoreGameBinding implements com.ghostapps.placapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener gameScoreAwaySetScoreandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.formattedAwayTeamSetScore
            //         is viewModel.setFormattedAwayTeamSetScore((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(gameScoreAwaySetScore);
            // localize variables for thread safety
            // viewModel.formattedAwayTeamSetScore
            java.lang.String viewModelFormattedAwayTeamSetScore = null;
            // viewModel
            com.ghostapps.placapp.viewModel.gameScore.GameScoreViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setFormattedAwayTeamSetScore(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener gameScoreAwayTeamNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.awayTeamName
            //         is viewModel.setAwayTeamName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(gameScoreAwayTeamName);
            // localize variables for thread safety
            // viewModel.awayTeamName
            java.lang.String viewModelAwayTeamName = null;
            // viewModel
            com.ghostapps.placapp.viewModel.gameScore.GameScoreViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setAwayTeamName(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener gameScoreAwayTeamScoreandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.formattedAwayTeamScore
            //         is viewModel.setFormattedAwayTeamScore((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(gameScoreAwayTeamScore);
            // localize variables for thread safety
            // viewModel.formattedAwayTeamScore
            java.lang.String viewModelFormattedAwayTeamScore = null;
            // viewModel
            com.ghostapps.placapp.viewModel.gameScore.GameScoreViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setFormattedAwayTeamScore(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener gameScoreHomeSetScoreandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.formattedHomeTeamSetScore
            //         is viewModel.setFormattedHomeTeamSetScore((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(gameScoreHomeSetScore);
            // localize variables for thread safety
            // viewModel
            com.ghostapps.placapp.viewModel.gameScore.GameScoreViewModel viewModel = mViewModel;
            // viewModel.formattedHomeTeamSetScore
            java.lang.String viewModelFormattedHomeTeamSetScore = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setFormattedHomeTeamSetScore(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener gameScoreHomeTeamNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.homeTeamName
            //         is viewModel.setHomeTeamName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(gameScoreHomeTeamName);
            // localize variables for thread safety
            // viewModel.homeTeamName
            java.lang.String viewModelHomeTeamName = null;
            // viewModel
            com.ghostapps.placapp.viewModel.gameScore.GameScoreViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setHomeTeamName(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener gameScoreHomeTeamScoreandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.formattedHomeTeamScore
            //         is viewModel.setFormattedHomeTeamScore((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(gameScoreHomeTeamScore);
            // localize variables for thread safety
            // viewModel.formattedHomeTeamScore
            java.lang.String viewModelFormattedHomeTeamScore = null;
            // viewModel
            com.ghostapps.placapp.viewModel.gameScore.GameScoreViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setFormattedHomeTeamScore(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityScoreGameBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ActivityScoreGameBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[8]
            , (com.google.android.material.button.MaterialButton) bindings[11]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            );
        this.gameScoreAwayDecrease.setTag(null);
        this.gameScoreAwayIncrease.setTag(null);
        this.gameScoreAwaySetScore.setTag(null);
        this.gameScoreAwayTeamName.setTag(null);
        this.gameScoreAwayTeamScore.setTag(null);
        this.gameScoreExitButton.setTag(null);
        this.gameScoreHomeDecrease.setTag(null);
        this.gameScoreHomeIncrease.setTag(null);
        this.gameScoreHomeSetScore.setTag(null);
        this.gameScoreHomeTeamName.setTag(null);
        this.gameScoreHomeTeamScore.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback8 = new com.ghostapps.placapp.generated.callback.OnClickListener(this, 4);
        mCallback6 = new com.ghostapps.placapp.generated.callback.OnClickListener(this, 2);
        mCallback9 = new com.ghostapps.placapp.generated.callback.OnClickListener(this, 5);
        mCallback7 = new com.ghostapps.placapp.generated.callback.OnClickListener(this, 3);
        mCallback5 = new com.ghostapps.placapp.generated.callback.OnClickListener(this, 1);
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
            setViewModel((com.ghostapps.placapp.viewModel.gameScore.GameScoreViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.ghostapps.placapp.viewModel.gameScore.GameScoreViewModel ViewModel) {
        updateRegistration(0, ViewModel);
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
            case 0 :
                return onChangeViewModel((com.ghostapps.placapp.viewModel.gameScore.GameScoreViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(com.ghostapps.placapp.viewModel.gameScore.GameScoreViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        java.lang.String viewModelFormattedAwayTeamScore = null;
        java.lang.String viewModelAwayTeamName = null;
        java.lang.String viewModelFormattedAwayTeamSetScore = null;
        java.lang.String viewModelHomeTeamName = null;
        java.lang.String viewModelFormattedHomeTeamScore = null;
        java.lang.String viewModelFormattedHomeTeamSetScore = null;
        com.ghostapps.placapp.viewModel.gameScore.GameScoreViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.formattedAwayTeamScore
                    viewModelFormattedAwayTeamScore = viewModel.getFormattedAwayTeamScore();
                    // read viewModel.awayTeamName
                    viewModelAwayTeamName = viewModel.getAwayTeamName();
                    // read viewModel.formattedAwayTeamSetScore
                    viewModelFormattedAwayTeamSetScore = viewModel.getFormattedAwayTeamSetScore();
                    // read viewModel.homeTeamName
                    viewModelHomeTeamName = viewModel.getHomeTeamName();
                    // read viewModel.formattedHomeTeamScore
                    viewModelFormattedHomeTeamScore = viewModel.getFormattedHomeTeamScore();
                    // read viewModel.formattedHomeTeamSetScore
                    viewModelFormattedHomeTeamSetScore = viewModel.getFormattedHomeTeamSetScore();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.gameScoreAwayDecrease.setOnClickListener(mCallback8);
            this.gameScoreAwayIncrease.setOnClickListener(mCallback7);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.gameScoreAwaySetScore, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, gameScoreAwaySetScoreandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.gameScoreAwayTeamName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, gameScoreAwayTeamNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.gameScoreAwayTeamScore, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, gameScoreAwayTeamScoreandroidTextAttrChanged);
            this.gameScoreExitButton.setOnClickListener(mCallback9);
            this.gameScoreHomeDecrease.setOnClickListener(mCallback6);
            this.gameScoreHomeIncrease.setOnClickListener(mCallback5);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.gameScoreHomeSetScore, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, gameScoreHomeSetScoreandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.gameScoreHomeTeamName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, gameScoreHomeTeamNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.gameScoreHomeTeamScore, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, gameScoreHomeTeamScoreandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.gameScoreAwaySetScore, viewModelFormattedAwayTeamSetScore);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.gameScoreAwayTeamName, viewModelAwayTeamName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.gameScoreAwayTeamScore, viewModelFormattedAwayTeamScore);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.gameScoreHomeSetScore, viewModelFormattedHomeTeamSetScore);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.gameScoreHomeTeamName, viewModelHomeTeamName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.gameScoreHomeTeamScore, viewModelFormattedHomeTeamScore);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.ghostapps.placapp.viewModel.gameScore.GameScoreViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onAwayTeamDecrease();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.ghostapps.placapp.viewModel.gameScore.GameScoreViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onHomeTeamDecrease();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                com.ghostapps.placapp.viewModel.gameScore.GameScoreViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onExitPressed();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.ghostapps.placapp.viewModel.gameScore.GameScoreViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onAwayTeamIncrease();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.ghostapps.placapp.viewModel.gameScore.GameScoreViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onHomeTeamIncrease();
                }
                break;
            }
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