package com.gym.dao;

import java.util.List;
import com.gym.model.MemberInfo;

public interface MemberDao {
	int saveMember(MemberInfo memberInfo);
	int deleteMember(int id);
	int updateMember(MemberInfo memberInfo);
	List<MemberInfo> getMembers();
	MemberInfo getMemberById(int id);
	
	

}
