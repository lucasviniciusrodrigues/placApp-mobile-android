package com.ghostapps.placapp.data.records.local;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.ghostapps.placapp.data.records.RecordEntity;
import com.ghostapps.placapp.data.records.ScoreEntity;
import com.ghostapps.placapp.data.records.local.converters.ScoreConverter;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RecordDao_Impl implements RecordDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RecordEntity> __insertionAdapterOfRecordEntity;

  private final ScoreConverter __scoreConverter = new ScoreConverter();

  private final EntityDeletionOrUpdateAdapter<RecordEntity> __deletionAdapterOfRecordEntity;

  public RecordDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRecordEntity = new EntityInsertionAdapter<RecordEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `records_database` (`homeTeamName`,`homeTeamSetScore`,`awayTeamName`,`awayTeamSetScore`,`scores`,`date`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RecordEntity value) {
        if (value.getHomeTeamName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getHomeTeamName());
        }
        stmt.bindLong(2, value.getHomeTeamSetScore());
        if (value.getAwayTeamName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAwayTeamName());
        }
        stmt.bindLong(4, value.getAwayTeamSetScore());
        final String _tmp;
        _tmp = __scoreConverter.ScoreEntityListToString(value.getScores());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp);
        }
        stmt.bindLong(6, value.getDate());
      }
    };
    this.__deletionAdapterOfRecordEntity = new EntityDeletionOrUpdateAdapter<RecordEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `records_database` WHERE `date` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RecordEntity value) {
        stmt.bindLong(1, value.getDate());
      }
    };
  }

  @Override
  public void insert(final RecordEntity recordEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfRecordEntity.insert(recordEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final RecordEntity recordEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfRecordEntity.handle(recordEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<RecordEntity> getRecords() {
    final String _sql = "SELECT * FROM records_database";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfHomeTeamName = CursorUtil.getColumnIndexOrThrow(_cursor, "homeTeamName");
      final int _cursorIndexOfHomeTeamSetScore = CursorUtil.getColumnIndexOrThrow(_cursor, "homeTeamSetScore");
      final int _cursorIndexOfAwayTeamName = CursorUtil.getColumnIndexOrThrow(_cursor, "awayTeamName");
      final int _cursorIndexOfAwayTeamSetScore = CursorUtil.getColumnIndexOrThrow(_cursor, "awayTeamSetScore");
      final int _cursorIndexOfScores = CursorUtil.getColumnIndexOrThrow(_cursor, "scores");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final List<RecordEntity> _result = new ArrayList<RecordEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final RecordEntity _item;
        final String _tmpHomeTeamName;
        _tmpHomeTeamName = _cursor.getString(_cursorIndexOfHomeTeamName);
        final int _tmpHomeTeamSetScore;
        _tmpHomeTeamSetScore = _cursor.getInt(_cursorIndexOfHomeTeamSetScore);
        final String _tmpAwayTeamName;
        _tmpAwayTeamName = _cursor.getString(_cursorIndexOfAwayTeamName);
        final int _tmpAwayTeamSetScore;
        _tmpAwayTeamSetScore = _cursor.getInt(_cursorIndexOfAwayTeamSetScore);
        final List<ScoreEntity> _tmpScores;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfScores);
        _tmpScores = __scoreConverter.stringToScoreEntityList(_tmp);
        final long _tmpDate;
        _tmpDate = _cursor.getLong(_cursorIndexOfDate);
        _item = new RecordEntity(_tmpHomeTeamName,_tmpHomeTeamSetScore,_tmpAwayTeamName,_tmpAwayTeamSetScore,_tmpScores,_tmpDate);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
