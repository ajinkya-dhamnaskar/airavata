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
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#ifndef user_profile_model_TYPES_H
#define user_profile_model_TYPES_H

#include <iosfwd>

#include <thrift/Thrift.h>
#include <thrift/TApplicationException.h>
#include <thrift/protocol/TProtocol.h>
#include <thrift/transport/TTransport.h>

#include <thrift/cxxfunctional.h>
#include "airavata_commons_types.h"


namespace apache { namespace airavata { namespace model { namespace user {

struct Status {
  enum type {
    ACTIVE = 0,
    CONFIRMED = 1,
    APPROVED = 2,
    DELETED = 3,
    DUPLICATE = 4,
    GRACE_PERIOD = 5,
    INVITED = 6,
    DENIED = 7,
    PENDING = 8,
    PENDING_APPROVAL = 9,
    PENDING_CONFIRMATION = 10,
    SUSPENDED = 11,
    DECLINED = 12,
    EXPIRED = 13
  };
};

extern const std::map<int, const char*> _Status_VALUES_TO_NAMES;

struct USCitizenship {
  enum type {
    US_CITIZEN = 0,
    US_PERMANENT_RESIDENT = 1,
    OTHER_NON_US_CITIZEN = 2
  };
};

extern const std::map<int, const char*> _USCitizenship_VALUES_TO_NAMES;

struct ethnicity {
  enum type {
    HISPANIC_LATINO = 0,
    NOT_HISPANIC_LATINO = 1
  };
};

extern const std::map<int, const char*> _ethnicity_VALUES_TO_NAMES;

struct race {
  enum type {
    ASIAN = 0,
    AMERICAN_INDIAN_OR_ALASKAN_NATIVE = 1,
    BLACK_OR_AFRICAN_AMERICAN = 2,
    NATIVE_HAWAIIAN_OR_PACIFIC_ISLANDER = 3,
    WHITE = 4
  };
};

extern const std::map<int, const char*> _race_VALUES_TO_NAMES;

struct disability {
  enum type {
    HEARING_IMAPAIRED = 0,
    VISUAL_IMPAIRED = 1,
    MOBILITY_OR_ORTHOPEDIC_IMPAIRMENT = 2,
    OTHER_IMPAIRMENT = 3
  };
};

extern const std::map<int, const char*> _disability_VALUES_TO_NAMES;

class NSFDemographics;

class UserProfile;

typedef struct _NSFDemographics__isset {
  _NSFDemographics__isset() : gender(false), usCitizenship(false), ethnicities(false), races(false), disabilities(false) {}
  bool gender :1;
  bool usCitizenship :1;
  bool ethnicities :1;
  bool races :1;
  bool disabilities :1;
} _NSFDemographics__isset;

class NSFDemographics {
 public:

  NSFDemographics(const NSFDemographics&);
  NSFDemographics& operator=(const NSFDemographics&);
  NSFDemographics() : airavataInternalUserId("DO_NOT_SET_AT_CLIENTS"), gender(), usCitizenship((USCitizenship::type)0) {
  }

  virtual ~NSFDemographics() throw();
  std::string airavataInternalUserId;
  std::string gender;
  USCitizenship::type usCitizenship;
  std::vector<ethnicity::type>  ethnicities;
  std::vector<race::type>  races;
  std::vector<disability::type>  disabilities;

  _NSFDemographics__isset __isset;

  void __set_airavataInternalUserId(const std::string& val);

  void __set_gender(const std::string& val);

  void __set_usCitizenship(const USCitizenship::type val);

  void __set_ethnicities(const std::vector<ethnicity::type> & val);

  void __set_races(const std::vector<race::type> & val);

  void __set_disabilities(const std::vector<disability::type> & val);

  bool operator == (const NSFDemographics & rhs) const
  {
    if (!(airavataInternalUserId == rhs.airavataInternalUserId))
      return false;
    if (__isset.gender != rhs.__isset.gender)
      return false;
    else if (__isset.gender && !(gender == rhs.gender))
      return false;
    if (__isset.usCitizenship != rhs.__isset.usCitizenship)
      return false;
    else if (__isset.usCitizenship && !(usCitizenship == rhs.usCitizenship))
      return false;
    if (__isset.ethnicities != rhs.__isset.ethnicities)
      return false;
    else if (__isset.ethnicities && !(ethnicities == rhs.ethnicities))
      return false;
    if (__isset.races != rhs.__isset.races)
      return false;
    else if (__isset.races && !(races == rhs.races))
      return false;
    if (__isset.disabilities != rhs.__isset.disabilities)
      return false;
    else if (__isset.disabilities && !(disabilities == rhs.disabilities))
      return false;
    return true;
  }
  bool operator != (const NSFDemographics &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const NSFDemographics & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

  virtual void printTo(std::ostream& out) const;
};

void swap(NSFDemographics &a, NSFDemographics &b);

inline std::ostream& operator<<(std::ostream& out, const NSFDemographics& obj)
{
  obj.printTo(out);
  return out;
}

typedef struct _UserProfile__isset {
  _UserProfile__isset() : middleName(false), namePrefix(false), nameSuffix(false), orcidId(false), phones(false), country(false), nationality(false), homeOrganization(false), orginationAffiliation(false), comments(false), labeledURI(false), gpgKey(false), timeZone(false), nsfDemographics(false) {}
  bool middleName :1;
  bool namePrefix :1;
  bool nameSuffix :1;
  bool orcidId :1;
  bool phones :1;
  bool country :1;
  bool nationality :1;
  bool homeOrganization :1;
  bool orginationAffiliation :1;
  bool comments :1;
  bool labeledURI :1;
  bool gpgKey :1;
  bool timeZone :1;
  bool nsfDemographics :1;
} _UserProfile__isset;

class UserProfile {
 public:

  UserProfile(const UserProfile&);
  UserProfile& operator=(const UserProfile&);
  UserProfile() : userModelVersion("1.0"), airavataInternalUserId("DO_NOT_SET_AT_CLIENTS"), userId(), gatewayId(), firstName(), lastName(), middleName(), namePrefix(), nameSuffix(), orcidId(), country(), homeOrganization(), orginationAffiliation(), creationTime(0), lastAccessTime(0), validUntil(0), State((Status::type)0), comments(), gpgKey(), timeZone() {
  }

  virtual ~UserProfile() throw();
  std::string userModelVersion;
  std::string airavataInternalUserId;
  std::string userId;
  std::string gatewayId;
  std::vector<std::string>  emails;
  std::string firstName;
  std::string lastName;
  std::string middleName;
  std::string namePrefix;
  std::string nameSuffix;
  std::string orcidId;
  std::vector<std::string>  phones;
  std::string country;
  std::vector<std::string>  nationality;
  std::string homeOrganization;
  std::string orginationAffiliation;
  int64_t creationTime;
  int64_t lastAccessTime;
  int64_t validUntil;
  Status::type State;
  std::string comments;
  std::vector<std::string>  labeledURI;
  std::string gpgKey;
  std::string timeZone;
  NSFDemographics nsfDemographics;

  _UserProfile__isset __isset;

  void __set_userModelVersion(const std::string& val);

  void __set_airavataInternalUserId(const std::string& val);

  void __set_userId(const std::string& val);

  void __set_gatewayId(const std::string& val);

  void __set_emails(const std::vector<std::string> & val);

  void __set_firstName(const std::string& val);

  void __set_lastName(const std::string& val);

  void __set_middleName(const std::string& val);

  void __set_namePrefix(const std::string& val);

  void __set_nameSuffix(const std::string& val);

  void __set_orcidId(const std::string& val);

  void __set_phones(const std::vector<std::string> & val);

  void __set_country(const std::string& val);

  void __set_nationality(const std::vector<std::string> & val);

  void __set_homeOrganization(const std::string& val);

  void __set_orginationAffiliation(const std::string& val);

  void __set_creationTime(const int64_t val);

  void __set_lastAccessTime(const int64_t val);

  void __set_validUntil(const int64_t val);

  void __set_State(const Status::type val);

  void __set_comments(const std::string& val);

  void __set_labeledURI(const std::vector<std::string> & val);

  void __set_gpgKey(const std::string& val);

  void __set_timeZone(const std::string& val);

  void __set_nsfDemographics(const NSFDemographics& val);

  bool operator == (const UserProfile & rhs) const
  {
    if (!(userModelVersion == rhs.userModelVersion))
      return false;
    if (!(airavataInternalUserId == rhs.airavataInternalUserId))
      return false;
    if (!(userId == rhs.userId))
      return false;
    if (!(gatewayId == rhs.gatewayId))
      return false;
    if (!(emails == rhs.emails))
      return false;
    if (!(firstName == rhs.firstName))
      return false;
    if (!(lastName == rhs.lastName))
      return false;
    if (__isset.middleName != rhs.__isset.middleName)
      return false;
    else if (__isset.middleName && !(middleName == rhs.middleName))
      return false;
    if (__isset.namePrefix != rhs.__isset.namePrefix)
      return false;
    else if (__isset.namePrefix && !(namePrefix == rhs.namePrefix))
      return false;
    if (__isset.nameSuffix != rhs.__isset.nameSuffix)
      return false;
    else if (__isset.nameSuffix && !(nameSuffix == rhs.nameSuffix))
      return false;
    if (__isset.orcidId != rhs.__isset.orcidId)
      return false;
    else if (__isset.orcidId && !(orcidId == rhs.orcidId))
      return false;
    if (__isset.phones != rhs.__isset.phones)
      return false;
    else if (__isset.phones && !(phones == rhs.phones))
      return false;
    if (__isset.country != rhs.__isset.country)
      return false;
    else if (__isset.country && !(country == rhs.country))
      return false;
    if (__isset.nationality != rhs.__isset.nationality)
      return false;
    else if (__isset.nationality && !(nationality == rhs.nationality))
      return false;
    if (__isset.homeOrganization != rhs.__isset.homeOrganization)
      return false;
    else if (__isset.homeOrganization && !(homeOrganization == rhs.homeOrganization))
      return false;
    if (__isset.orginationAffiliation != rhs.__isset.orginationAffiliation)
      return false;
    else if (__isset.orginationAffiliation && !(orginationAffiliation == rhs.orginationAffiliation))
      return false;
    if (!(creationTime == rhs.creationTime))
      return false;
    if (!(lastAccessTime == rhs.lastAccessTime))
      return false;
    if (!(validUntil == rhs.validUntil))
      return false;
    if (!(State == rhs.State))
      return false;
    if (__isset.comments != rhs.__isset.comments)
      return false;
    else if (__isset.comments && !(comments == rhs.comments))
      return false;
    if (__isset.labeledURI != rhs.__isset.labeledURI)
      return false;
    else if (__isset.labeledURI && !(labeledURI == rhs.labeledURI))
      return false;
    if (__isset.gpgKey != rhs.__isset.gpgKey)
      return false;
    else if (__isset.gpgKey && !(gpgKey == rhs.gpgKey))
      return false;
    if (__isset.timeZone != rhs.__isset.timeZone)
      return false;
    else if (__isset.timeZone && !(timeZone == rhs.timeZone))
      return false;
    if (__isset.nsfDemographics != rhs.__isset.nsfDemographics)
      return false;
    else if (__isset.nsfDemographics && !(nsfDemographics == rhs.nsfDemographics))
      return false;
    return true;
  }
  bool operator != (const UserProfile &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const UserProfile & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

  virtual void printTo(std::ostream& out) const;
};

void swap(UserProfile &a, UserProfile &b);

inline std::ostream& operator<<(std::ostream& out, const UserProfile& obj)
{
  obj.printTo(out);
  return out;
}

}}}} // namespace

#endif
