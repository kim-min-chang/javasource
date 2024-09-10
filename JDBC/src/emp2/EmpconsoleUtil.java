package emp2;

import java.util.Scanner;
import java.util.List;

public class EmpconsoleUtil {

    public EmpDTO insertEmp(Scanner sc) {
        // 입력 데이터 동적처리
        System.out.println("============데이터 입력 ===============");
        System.out.print("사번 : ");
        int empno = Integer.parseInt(sc.nextLine());
        System.out.print("이름 : ");
        String ename = sc.nextLine();
        System.out.print("직무 : ");
        String job = sc.nextLine();
        System.out.print("매니저번호 : ");
        int mgr = Integer.parseInt(sc.nextLine());
        System.out.print("입사일 : ");
        String hiredate = sc.nextLine();
        System.out.print("급여 : ");
        int sal = Integer.parseInt(sc.nextLine());
        System.out.print("수당 : ");
        int comm = Integer.parseInt(sc.nextLine());
        System.out.print("부서번호 : ");
        int deptno = Integer.parseInt(sc.nextLine());

        return new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
    }

    public int getEmpno(Scanner sc) {
        System.out.print("조회할 사원의 사번을 입력하세요 : ");
        // int empno = sc.nextInt();
        // return empno;
        return Integer.parseInt(sc.nextLine());
    }
    // 사번 입력 받은 후 리턴

    public void printEmp(EmpDTO dto) {
        // dto 내용출력
        // smith 사원
        // ============================
        // 사번 : 7788
        // 직무 :
        // 입사일 :
        // 급여 :
        // 부서번호 :
        System.out.println(dto.getEname() + "사원");
        System.out.println("================================");
        System.out.println("사번 : " + dto.getEmpno());
        System.out.println("직무 : " + dto.getJob());
        System.out.println("입사일 : " + dto.getHiredate());
        System.out.println("급여 : " + dto.getSal());
        System.out.println("수당 : " + dto.getComm());
        System.out.println("부서번호 : " + dto.getDeptno());

    }

    public void printListEmp(List<EmpDTO> list) {
        System.out.println("==================================================================");
        System.out.println("empno   ename   job     mgr       hiredate    sal    comm   deptno");
        System.out.println("==================================================================");

        for (EmpDTO empDTO : list) {

            System.out.print(empDTO.getEmpno() + "\t");
            System.out.print(empDTO.getEname() + "\t");
            System.out.print(empDTO.getJob() + "\t");
            System.out.print(empDTO.getMgr() + "\t");
            System.out.print(empDTO.getHiredate() + "\t");
            System.out.print(empDTO.getSal() + "\t");
            System.out.print(empDTO.getComm() + "\t");
            System.out.print(empDTO.getDeptno() + "\n");

        }
    }

    public EmpDTO updateInfo(Scanner sc) {
        // 수정할 정보 입력 받기 => 입력받은 EmpDTO 담은 후 리턴
        System.out.println("===================사원정보 수정======================");
        System.out.print("사번 : ");
        int empno = Integer.parseInt(sc.nextLine());
        System.out.print("급여 : ");
        int sal = Integer.parseInt(sc.nextLine());
        System.out.print("수당 : ");
        int comm = Integer.parseInt(sc.nextLine());

        EmpDTO dto = new EmpDTO();
        dto.setEmpno(empno);
        dto.setSal(sal);
        dto.setComm(comm);
        return dto;
        // return new EmpDTO(empno, null,null,0,null,sal,comm,0);
    }

    public int deleteEmpNo(Scanner sc) {
        // 삭제할 empno 받은 후 리턴
        System.out.print("삭제할 사번 입력");
        return Integer.parseInt(sc.nextLine());

    }
}
