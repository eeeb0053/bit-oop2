package user;
/**
 * �䱸���� (�������)
 * <����ڱ��>
 * 1. ȸ������
 * 2. �α��� 
 * 3. ��� ����
 * 4. ȸ��Ż��
 * 5. ���̵� ���� üũ
 * 6. ����������
 * **********
 * <�����ڱ��>
 * 7. ȸ�����
 * 8. ���̵�˻�
 * 9. �̸��˻�
 * 10. ��ü ȸ����
 */
public interface UserService {
	public String joinUs(UserDTO user);
	public String login(UserDTO user);
	public String editPassword(UserDTO user);
	public String quit(UserDTO user);
	public String checkId(UserDTO user);
	public String mypage(UserDTO user);
	
	public String memberList(UserDTO user);
	public String searchId(UserDTO user);
	public String searchName(UserDTO user);
	public int totalNumberOfMembers(UserDTO user);
}
