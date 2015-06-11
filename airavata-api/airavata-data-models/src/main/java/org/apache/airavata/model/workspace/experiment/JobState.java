/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.workspace.experiment;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum JobState implements org.apache.thrift.TEnum {
  SUBMITTED(0),
  UN_SUBMITTED(1),
  SETUP(2),
  QUEUED(3),
  ACTIVE(4),
  COMPLETE(5),
  CANCELING(6),
  CANCELED(7),
  FAILED(8),
  HELD(9),
  SUSPENDED(10),
  UNKNOWN(11);

  private final int value;

  private JobState(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static JobState findByValue(int value) { 
    switch (value) {
      case 0:
        return SUBMITTED;
      case 1:
        return UN_SUBMITTED;
      case 2:
        return SETUP;
      case 3:
        return QUEUED;
      case 4:
        return ACTIVE;
      case 5:
        return COMPLETE;
      case 6:
        return CANCELING;
      case 7:
        return CANCELED;
      case 8:
        return FAILED;
      case 9:
        return HELD;
      case 10:
        return SUSPENDED;
      case 11:
        return UNKNOWN;
      default:
        return null;
    }
  }
}
