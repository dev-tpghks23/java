package optionalTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptionalTest {
	
	ArrayList<User> users = new ArrayList<User>(Arrays.asList(
			new User("김세환", "ksh", "1234"),
			new User("홍길동", "hkd", "1234"),
			new User("이순신", "lss", "1234"),
			new User("장보고", "jbg", "1234")
			));
	
//	for문에 한 번이라도 안들어갔다면 null값을 리턴
//	NPE뜨는 상황
//	강조 ※Optional을 배웠다고 다 Optional로 감싸지 말아라... 제발!
//	반드시 리턴 타입에서만 Optional을 사용하고, 단일 객체만 감싸준다.
//	Optional<List<User>> : 망함
	public Optional<User> findById(Long id) {
		User user = null;
		for(User userInDb: users) {
			if(userInDb.getId() == id) {
				user = userInDb;
			}
		}
		return Optional.ofNullable(user);
	}
	
	public static void main(String[] args) {
		OptionalTest optionalTest = new OptionalTest();
//		Optional<User> foundUser = optionalTest.findById(10L);
		
//		orElseThrow : 실무에서 가장 많이 사용되는 메서드
//		user가 null이 아니면 통째로 user
//		user가 없으면 통째로 예외
		
//		User user = foundUser.orElseThrow(() -> {
//			throw new NoSearchException("그런 사람은 없습니다~!");
//		});
		
//		boolean
		optionalTest.findById(3L).map(User::getUserId).isPresent();
		optionalTest.findById(10L).map(User::getUserId).ifPresent(System.out::print);
		optionalTest.findById(10L).map(User::getUserId).ifPresentOrElse((userId)->{
			System.out.println(userId);
		}, ()->{
			System.out.println("존재하지 않는 유저입니다.");
		});
		
		
//		if(user != null) {
//			System.out.println(user.getId());
//		}else {
//			System.out.println("존재하지 않는 회원입니다.");
//		}
		
//		
		
		
		
		
	}
}










