/**
 * Karyawan
 */
public class Karyawan {

    private String department;
    private int kodeKaryawan;
    private String namaKaryawan;
    
    /**
     * Get Department
     * @return
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Set Department
     * @param department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Get Kode Karyawan
     * @return
     */
    public int getKodeKaryawan() {
        return kodeKaryawan;
    }

    /**
     * Set Kode Karyawan
     * @param kodeKaryawan
     */
    public void setKodeKaryawan(int kodeKaryawan) {
        this.kodeKaryawan = kodeKaryawan;
    }

    /**
     * Get Nama Karyawan
     * @return
     */
    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    /**
     * Set Nama Karyawan
     * @param namaKaryawan
     */
    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }


    /**
     * Constructor
     * @param department
     * @param kodeKaryawan
     * @param namaKaryawan
     */
    public Karyawan(String department, int kodeKaryawan, String namaKaryawan) {
        this.department = department;
        this.kodeKaryawan = kodeKaryawan;
        this.namaKaryawan = namaKaryawan;
    }

    
}