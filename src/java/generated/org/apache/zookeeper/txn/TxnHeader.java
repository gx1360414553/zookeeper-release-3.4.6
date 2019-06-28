// File generated by hadoop record compiler. Do not edit.
/*
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.apache.zookeeper.txn;

import org.apache.jute.*;

/**
 * 事务请求头
 */
public class TxnHeader implements Record {
      private long clientId;
      private int cxid;
      private long zxid;
      private long time;
      private int type;
      public TxnHeader() {
      }
      public TxnHeader(
            long clientId,
            int cxid,
            long zxid,
            long time,
            int type) {
        this.clientId=clientId;
        this.cxid=cxid;
        this.zxid=zxid;
        this.time=time;
        this.type=type;
      }
      public long getClientId() {
        return clientId;
      }
      public void setClientId(long m_) {
        clientId=m_;
      }
      public int getCxid() {
        return cxid;
      }
      public void setCxid(int m_) {
        cxid=m_;
      }
      public long getZxid() {
        return zxid;
      }
      public void setZxid(long m_) {
        zxid=m_;
      }
      public long getTime() {
        return time;
      }
      public void setTime(long m_) {
        time=m_;
      }
      public int getType() {
        return type;
      }
      public void setType(int m_) {
        type=m_;
      }

      @Override
      public void serialize(OutputArchive a_, String tag) throws java.io.IOException {
        a_.startRecord(this,tag);
        a_.writeLong(clientId,"clientId");
        a_.writeInt(cxid,"cxid");
        a_.writeLong(zxid,"zxid");
        a_.writeLong(time,"time");
        a_.writeInt(type,"type");
        a_.endRecord(this,tag);
      }
      @Override
      public void deserialize(InputArchive a_, String tag) throws java.io.IOException {
        a_.startRecord(tag);
        clientId=a_.readLong("clientId");
        cxid=a_.readInt("cxid");
        zxid=a_.readLong("zxid");
        time=a_.readLong("time");
        type=a_.readInt("type");
        a_.endRecord(tag);
    }
        @Override
      public String toString() {
        try {
          java.io.ByteArrayOutputStream s =
            new java.io.ByteArrayOutputStream();
          CsvOutputArchive a_ =
            new CsvOutputArchive(s);
          a_.startRecord(this,"");
        a_.writeLong(clientId,"clientId");
        a_.writeInt(cxid,"cxid");
        a_.writeLong(zxid,"zxid");
        a_.writeLong(time,"time");
        a_.writeInt(type,"type");
          a_.endRecord(this,"");
          return new String(s.toByteArray(), "UTF-8");
        } catch (Throwable ex) {
          ex.printStackTrace();
        }
        return "ERROR";
      }
      public void write(java.io.DataOutput out) throws java.io.IOException {
        BinaryOutputArchive archive = new BinaryOutputArchive(out);
        serialize(archive, "");
      }
      public void readFields(java.io.DataInput in) throws java.io.IOException {
        BinaryInputArchive archive = new BinaryInputArchive(in);
        deserialize(archive, "");
      }
      public int compareTo (Object peer_) throws ClassCastException {
        if (!(peer_ instanceof TxnHeader)) {
          throw new ClassCastException("Comparing different types of records.");
        }
        TxnHeader peer = (TxnHeader) peer_;
        int ret = 0;
        ret = (clientId == peer.clientId)? 0 :((clientId<peer.clientId)?-1:1);
        if (ret != 0){
            return ret;
        }
        ret = (cxid == peer.cxid)? 0 :((cxid<peer.cxid)?-1:1);
        if (ret != 0){
            return ret;
        }
        ret = (zxid == peer.zxid)? 0 :((zxid<peer.zxid)?-1:1);
        if (ret != 0){
            return ret;
        }
        ret = (time == peer.time)? 0 :((time<peer.time)?-1:1);
        if (ret != 0){
            return ret;
        }
        ret = (type == peer.type)? 0 :((type<peer.type)?-1:1);
        if (ret != 0){
            return ret;
        }
         return ret;
      }
      @Override
      public boolean equals(Object peer_) {
        if (!(peer_ instanceof TxnHeader)) {
          return false;
        }
        if (peer_ == this) {
          return true;
        }
        TxnHeader peer = (TxnHeader) peer_;
        boolean ret = false;
        ret = (clientId==peer.clientId);
        if (!ret){
            return ret;
        }
        ret = (cxid==peer.cxid);
        if (!ret){
            return ret;
        }
        ret = (zxid==peer.zxid);
        if (!ret){
            return ret;
        }
        ret = (time==peer.time);
        if (!ret){
            return ret;
        }
        ret = (type==peer.type);
        if (!ret){
            return ret;
        }
         return ret;
      }
      @Override
      public int hashCode() {
        int result = 17;
        int ret;
        ret = (int) (clientId^(clientId>>>32));
        result = 37*result + ret;
        ret = (int)cxid;
        result = 37*result + ret;
        ret = (int) (zxid^(zxid>>>32));
        result = 37*result + ret;
        ret = (int) (time^(time>>>32));
        result = 37*result + ret;
        ret = (int)type;
        result = 37*result + ret;
        return result;
      }
      public static String signature() {
        return "LTxnHeader(lilli)";
      }
}
