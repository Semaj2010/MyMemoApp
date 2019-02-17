package com.example.semaj.mymemoapp.data;

import android.support.annotation.NonNull;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Single;

public interface MemoDataSource {
    interface DataListCallback{
        void onListLoaded(List<Memo> memoList);

        void onError();
    }
    interface DataCallback{
        void onLoaded(Memo memo);

        void onError();
    }
    Flowable<List<Memo>> getMemoList();

    Flowable<Memo> getMemo(@NonNull Long memoId);

    Single<Memo> saveMemo(Memo memo);

    void deleteMemo(Long memoId);

    Completable deleteAllMemo();

    Completable deleteMemos(long[] ids, int cnt);
}
