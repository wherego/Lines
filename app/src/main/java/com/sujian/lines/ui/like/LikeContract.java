package com.sujian.lines.ui.like;

import com.sujian.lines.base.BaseModel;
import com.sujian.lines.base.BasePresenter;
import com.sujian.lines.base.BaseView;
import com.sujian.lines.data.CreatedResult;
import com.sujian.lines.data.Data;
import com.sujian.lines.data.entity.Like;

import rx.Observable;

/**
 * Created by sujian on 2016/9/13.
 * Mail:121116111@qq.com
 */
public class LikeContract {

    interface Model extends BaseModel {
        Observable<Data<Like>> getLikeData(String where, int skip, int limit);

        Observable<CreatedResult> deleteLike(String objectId);
    }

    interface View extends BaseView {
        void showLike(Data<Like> data);

        void showMsg(String msg);
    }

    static abstract class Presenter extends BasePresenter<Model, View> {

        abstract void getLikeData();

        abstract void deleteLike(Like like);

        @Override
        public void onStart() {

        }
    }
}
